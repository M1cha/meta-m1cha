setenv bootargs console=${console} loglevel=9 earlyprintk root=/dev/ram0
load mmc 0:1 0x42000000 fitImage
bootm
