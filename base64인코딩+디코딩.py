import base64   #모듈추가

#base64로 변환 후 문자열로 변환하는 과정
sitename='congratulations! this is the real message'
sitename_bytes=sitename.encode('ascii') #문자열을 bytes타입으로 인코딩변환(base64로 변환을 위함)
sitename_base64=base64.b64encode(sitename_bytes)    #bytes타입을 base64로 다시 변환
sitename_base64_str=sitename_base64.decode('ascii') #bytes타입의 bytest타입을 디코딩

print(sitename_base64_str)  #한 번 디코딩한 값


#base64값을 다시 디코딩
site_base64_str='V1RJNWRWb3pTbWhrU0ZaeldWaFNjR0l5TlhwSlUwSXdZVWRzZWtsSGJIcEpTRkp2V2xOQ2VWcFhSbk5KUnpGc1l6Tk9hRm95VlVzSwo='
sitename_bytes=base64.b64decode(sitename_base64_str)
sitename=sitename_bytes.decode('ascii')

print(sitename)
