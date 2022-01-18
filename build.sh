#!/bin/bash
set -e
export DL_DIR=${HOME}/yocto/downloads
export SSTATE_DIR=${HOME}/yocto/sstate-cache
mkdir -p ${DL_DIR}
mkdir -p ${SSTATE_DIR}
kas-container build $1
