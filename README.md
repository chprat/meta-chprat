This README file contains information on the contents of the meta-chprat layer.

Please see the corresponding sections below for details.

Build
=====

Use [KAS](https://github.com/siemens/kas) to build the images. Prefer
using the Docker based kas-container. Execute the following step to
set everything up:

1. Install Docker
2. Download kas-container file from the repo (prefer a tagged version)
3. Move it to a location known by you path variable
4. Mark it executable
5. Set DL_DIR environment variable (folder will be mounted to container)
6. Set SSTATE_DIR environment variable (folder will be mounted to container)
7. Run the build

A command line sequence for a build would look like

```
export DL_DIR=${HOME}/yocto/downloads
export SSTATE_DIR=${HOME}/yocto/sstate-cache
kas-container build print-server.yml
```
