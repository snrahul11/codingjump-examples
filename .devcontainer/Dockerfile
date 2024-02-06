FROM --platform=linux/amd64 ubuntu:22.04 
ENV DEBIAN_FRONTEND=noninteractive 
RUN apt-get update -y \
    && apt-get install -y software-properties-common \
    && add-apt-repository universe -y \
    && apt-get install -y locales locales-all

ENV LC_ALL en_US.UTF-8
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US.UTF-8

# git 
RUN apt-get install -y git git-lfs
RUN git config --global credential.helper store 

# Basic tools
RUN apt-get install -y gnupg gnupg2 curl wget lsof apache2-utils

# Install java and maven dependencies
RUN apt-get install -y openjdk-17-jdk maven

# nodejs
RUN curl -fsSL https://deb.nodesource.com/setup_20.x | bash
RUN apt-get install -y nodejs
