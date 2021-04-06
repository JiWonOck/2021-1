#!/usr/bin/python2
import os, sys

if not sys.version_info[0] < 3:
    print("Use python2 for this")
    os._exit(0)

if len(sys.argv) != 2:
    print("usage: python pngransome.py [file]")
    os._exit(0)

filename = sys.argv[1]
with open(filename, 'rb') as f:
    buf = f.read()

if buf[1:4] != 'PNG':
    print("this is not PNG file")
    os._exit(0)

enc = ''
for c in buf:
    enc += chr( ord(c) ^ 0xff )

with open(filename+'.enc', 'wb') as f:
    f.write(enc)

print("file is encrypted.")

