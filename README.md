This README file contains information on the contents of the meta-chprat layer.

Please see the corresponding sections below for details.

Repository preparation
======================

To not spread personal information and allow customization some files need to
be adapted before being usable.

WiFi configuration
------------------

Create a wpa_supplicant configuration file
``sources/meta-chprat/recipes-connectivity/wpa-supplicant/wpa-supplicant/wpa_supplicant-wlan0.conf``
with the following content:

```
ctrl_interface=/var/run/wpa_supplicant
ctrl_interface_group=0
update_config=1
country=

network={
	ssid=
	scan_ssid=1
	psk=
	key_mgmt=WPA-PSK
}
```

Adjust the ``country``, ``ssid`` and ``psk`` (or the ``network`` section in
general) values according to you needs.

You can use the tool ``wpa_passphrase`` to generate an encrypted value for
your passphrase, if you don't want to enter it as plain text.

SSH paswordless connection
--------------------------

Create a authorized_keys file
``sources/meta-chprat/recipes-skeleton/useradd/useradd-cpr/authorized_keys``
and add as many SSH public key entries as you need to allow SSH
authentification without a password.

Use the tool ``ssh-keygen`` to generate a SSH key pair, in case you don't
already have one.

Build
=====

Use [KAS](https://github.com/siemens/kas) to build the images. Prefer
using the Docker based ``kas-container``. Execute the following steps to
set everything up:

1. Install Docker
2. Download ``kas-container`` file from the repo (prefer a tagged version)
3. Move it to a location known to your path variable
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

The script ``build.sh`` is used to wrap setting the environment variables and
the ``kas-container build`` command. So you just need to execute

``
./build.sh print-server.yml
``
