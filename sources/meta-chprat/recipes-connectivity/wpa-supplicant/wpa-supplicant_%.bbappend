FILES:${PN}:append = " {sysconfdir}/${PN}/${PN}-wlan0.conf"

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
    ln -s ${systemd_system_unitdir}/wpa_supplicant@.service \
        ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service
}
