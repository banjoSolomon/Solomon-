score = int(input("Enter a number: "))
passed = 0
failed = 0

while(score >=0 and score  <=100):
	score = int(input("Enter a number: "))
	if(score >= 45):
		passed +=1
	if(score < 45):
		failed +=1
	elsif (score > 100 and score <0)
print("INVALID!!!!");

print(passed, "Student that passed")
print(failed, "Student that failed")
