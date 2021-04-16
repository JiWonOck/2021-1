import sys
import base64
from Crypto.Cipher import AES

class AESCipher(object):
  def __init__(self, key):    #자동호출
    self.bs = 16              #bs라는 변수를 16, cipher내용을 이렇게 넣어라
    self.cipher = AES.new(key, AES_MODE_ECB)
    
  def encrypt(self, raw):
    raw = self._pad(raw)
    encrypted = self.cipher.encrypt(raw)
    encoded = base64.b64encode(encrypted)   #raw에 대해 바이너리데이터를 친숙한 글자로 바꿔주기 위해 base64로 인코딩
    return str(encoded, 'utf-8')            #python3에서 utf-8로 한 번 더 암호화해줘야 함(우분투)
    
   def decrypt(self, raw)
    decoded = base64.b64decode(encrypted)
    return str(self._unpad(decrypted), 'utf-8') #패딩을 다시 떼줌
    
   def _pad(self, s):   #16블록이면 한 블록씩, 0으로 자릿수를 맞춰줌
    return s + (self.bs - len(s) % self.bs) + chr(0)
    
   def _unpad(self, s):
    return s
    #return s[:-ord(s[len(s)-1:])]
    
encrypted = 'AES-EBC로 암호화된 데이터'
  
if __name__ == '__main__':
   key = 'veryveryeasy????'   #key는 16바이트, ????자리 반복문으로 알아내기
   cipher = AESCipher(key)
   
   #E = cipher.encrypt('hello world!')
   #print(E)
   #D = cipher.decrypt(E)
   #print(D)
   
   #반복문으로 키값 알아내기
   for i in range(10000):
    #.ljust
    if i<10: key='000' + str(i)
    elif i<100: key='00' + str(i)
    elif i<1000: key='0' + str(i)
    else: key=str(i)
    cipher2 = AESCipher('veryveryeasy'+key)
    try:                                      #try:..except:...가 파이썬에서 오류가 있어도 지나가게 해줌
      D2 = cipher2.decrypt(encrypted)
      print('key digits:%s'%key)
      print(D2)
     except:
      pass                                    #pass는 무의미
