require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for imx6 TinyRex/Rex boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "(imx6-tinyrexlite|imx6-tinyrexbasic|imx6-tinyrexpro|imx6-tinyrexmax|imx6s-tinyrex|imx6dl-tinyrex|imx6q-tinyrex|imx6-rexbasic|imx6-rexpro|imx6dl-rex)"

PROVIDES += "u-boot"

PV = "v2014.10"

SRCBRANCH = "master"
SRCREV = "5a2755d75de62661aca0adb23d93f76a9f9d5ce5"
UBOOT_SRC ?= "git://github.com/roughboards/imx6tinyrex_uboot_v2014_10.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
