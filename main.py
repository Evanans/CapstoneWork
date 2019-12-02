import random
class nameClass:
  User1 = input("input your First Name: ")
  User2 = input("input your Last Name: ")
  firstName = str(User1)
  lastName = str(User2)
  fullName = firstName +" " + lastName
  age = input("input your Age: ")
  grade = input("enter your Computer Science grade: ")
  termsList = [age, grade, fullName]

def checkAge(age, ofAge, name):
  print(str(age) + " Years Old.")
  if not(ofAge):
    print(name +" age "+ str(age) + " " + 'is not "old enough" to access this resource')

  else:
      print("Welcome" + " " + name + "!")
      checkScore(nameClass.grade)
def calculateAge(age):
  if float(age) >= 18:
    isOfAge = True
    return isOfAge
def checkScore(score):
  if float(score) < 80 :
    print("Your grade is " + score)
  else:
    print("Good Job, You are Doing Great, your Grade is " + score + "%")
checkAge(nameClass.age, calculateAge(nameClass.age), nameClass.fullName)
print(nameClass.termsList)
