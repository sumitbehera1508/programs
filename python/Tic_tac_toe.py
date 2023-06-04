#tic tac toe game
def bord():
    print("--"*27)
    print('|'," "*6,arr[0]," "*6,"|"," "*6,arr[1]," "*5,"|"," "*6,arr[2]," "*6,"|")
    print("--"*27)
    print('|'," "*6,arr[3]," "*6,"|"," "*6,arr[4]," "*5,"|"," "*6,arr[5]," "*6,"|")
    print("--"*27)
    print('|'," "*6,arr[6]," "*6,"|"," "*6,arr[7]," "*5,"|"," "*6,arr[8]," "*6,"|")
    print("--"*27)

def complete()->bool:
    if(((arr[0]==arr[1])&(arr[1]==arr[2])) | ((arr[3]==arr[4])&(arr[4]==arr[5])) | ((arr[6]==arr[7])&(arr[7]==arr[8]))):
        return False
    elif(((arr[0]==arr[3])&(arr[3]==arr[6])) | ((arr[1]==arr[4])& (arr[4]==arr[7])) |((arr[2]==arr[5]) & (arr[5]==arr[8]))):
        return False
    elif(((arr[0]==arr[4]) & (arr[4] == arr[8])) | ((arr[2]==arr[4]) & (arr[4]==arr[6]))):
        return False
    else:
        return True
arr = [0,1,2,3,4,5,6,7,8]
left = [0,1,2,3,4,5,6,7,8]
print("-"*100,"\n"," "*45,"start game")
while(complete()):
      bord()
      p1 = int(input("player1 enter the position :"))
      if(p1 not in left):
          print("invalid Input ")
          break
      else:
          arr[p1] = "X"
          left.remove(p1)
      bord()
      if(left == []):
          print("Tie")
          break
      if(complete()==False):
          print("player1 won ")
          break
      p2 = int(input("player2 enter the position : "))
      if(p2 not in left):
          print("invalid Input ")
          break
      else:
          arr[p2] = "O"
          left.remove(p2)
      bord()
      if(complete()==False):
          print("player2 won ")
          break
