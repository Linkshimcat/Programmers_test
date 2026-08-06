def solution(a, b):
    plu = str(a) + str(b)
    plu2 = int(plu)
    result = (2 * a * b)
    answer = 0
    
    if (plu2 > result) :
        answer = plu2
    
    elif (plu2 < result) :
        answer = result
        
    return answer