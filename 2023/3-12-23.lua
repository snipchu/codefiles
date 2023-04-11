-- This lua code a solution to an assignemnt in my python class
-- It plays rock-paper-scissors with you, for 1 or 3 rounds

local wins = 0
local loses = 0

local function getinput(text)
	io.write(text)
	return io.read()
end

local function tochoice(num)
	if num == 1 then
		return "Rock"
	elseif num == 2 then
		return "Paper"
	else
		return "Scissors"
	end
end

local rounds = tonumber(getinput("Best 2 of 3? :"))
if rounds == 1 then
	rounds = 3
else
	rounds = 1
end

for i = 1, rounds, 1 do
	local botchoice = math.random(1, 3)
	local userchoice = tonumber(getinput("Rock, paper, or scissors? "))

	print("You said: " .. tochoice(userchoice))
	print("I said: " .. tochoice(botchoice))

	if userchoice == botchoice then
		print("Tie")
	elseif
		(userchoice == 1 and botchoice == 3)
		or (userchoice == 2 and botchoice == 1)
		or (userchoice == 3 and botchoice == 2)
	then
		print("You win")
		wins = wins + 1
	else
		print("You lost")
		loses = loses + 1
	end
end

print("You won " .. wins .. " times")
print("I won " .. loses .. " times")
print("We tied " .. rounds - wins - loses .. " times")

if wins == loses then
	print("We tied")
elseif wins > loses then
	print("You won")
else
	print("I win")
end
