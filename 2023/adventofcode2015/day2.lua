local file = io.open("day2.txt", "r")
file = file:read("*all")

local function calculate(l, w, h)
	return (2 * l * w) + (2 * w * h) + (2 * h * l)
end
