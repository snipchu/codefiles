def get_unit_of_measurement():
    response = int(input("insert measurement\n\t1: yards\n\t2: inches\n\t3: feet\n"))

    while response < 1 or response > 3:
        print("Try again.")
        response = int(input("insert measurement\n\t1: yards\n\t2: inches\n\t3: feet\n"))
    
    if response == 1:
        response = "yards"
    elif response == 2:
        response = "inches"
    else:
        response = "feet"
    
    return response
        

unit = get_unit_of_measurement()
print(unit)