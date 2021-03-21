#python request 사용
#pwnable.kr 로그인 세션쿠키 확인
#python request로 로그인된 페이지를 한번에 접근하기

import requests


coo = {"cookiename" : "value"}  #set your cookie
url = "https://pwnable.kr/"


#ignore weak DH key error
requests.packages.urllib3.util.ssl_.DEFAULT_CIPHERS += 'High:!DH:!aNULL'
try:
    requests.packages.urllib3.contrib.pyopenssl.DEFAULT_SSL_CIPHER_LIST += 'High:!DH:!aNULL'
except AttributeError:
    #no pyopenssl support use / neede / available
    pass

response = requests.get(url, cookies=coo, verify=False)
print("status code : ", response.status_code)
print(response.text)
