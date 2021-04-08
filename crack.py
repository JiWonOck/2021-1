import hashlib
password = '????'   # alphanumeric
hash = 'cd89f2da2ebaf2812b85bd0a6390a656b14a11d0' # hashlib.sha1(password).hexdigest()
i = 0

# alphanumeric letters.
letters = 'abcdefghijklmnopqrstuvwxyz'
letters += 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
letters += '0123456789'

# find password!
for a in letters:
    for b in letters:
        for c in letters:
            for d in letters:
                P = a+b+c+d
#LMS에서 다시 다운받기
                
