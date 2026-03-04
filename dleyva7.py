#Danya Leyva
#Lab 7

secret_number = 7

guess_str = input("Guess a number between 0 and 9: ")

if not guess_str.isdigit():
    print("That wasnt a valid number. Please run again and enter a digit 0-9")
else:
    guess = int(guess_str)
    
    if guess < secret_number:
        print("Your guess is LOWER than the number")
        print("YOU LOSE! better luck next time :(")
    elif guess > secret_number:
        print("Your guess is HIGHER than the number")
        print("YOU LOSE! better luck next time :(")
    else:
        print("WINNER!!! you guessed it :)")

print ("\n--- For Loop Joke ---")
for i in range(5):
    print (f"{i+1}: Why dont programers like nature?? It has too many bugs. :P")

print ("\n--- While loop favorite food ---")
fav_food = "In and out burger"
count = 0
while count < 5:
    print(fav_food)
    count += 1
