def solution(a, b):
    left = int(str(a) + str(b))
    right = int(str(b) + str(a))
    answer = 0
    
    if(left > right) : answer = left
    else : answer = right
    return answer