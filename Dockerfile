FROM runmymind/docker-android-sdk:alpine-standalone

RUN apk update && apk upgrade && \
    apk add --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community \
            bash \
            gradle \
            npm \
            rlwrap && \
    npm config set unsafe-perm true && \
    npm install -g yarn && \
    curl -Lo /tmp/clojure_install.sh \
      https://download.clojure.org/install/linux-install-1.10.3.855.sh && \
    /bin/bash /tmp/clojure_install.sh && rm /tmp/clojure_install.sh

