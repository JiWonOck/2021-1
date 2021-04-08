import hashlib
prefix = 'bla'
i = 0
while True:
    x = prefix + hex(i).replace('0x', '')
    x += 'A'*(20 - len(x))
    hash = hashlib.sha1(x.encode('utf-8')).hexdigest()
    if hash[-5:] == '00000':
        print('input found : {0}, {1}'.format(x, hash))
        break
    i += 1
    if i%100000 == 0:
        print('so far {0}, {1}, {2}'.format(x, i, hash))

