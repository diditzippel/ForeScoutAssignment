# ForeScoutAssignment

Your assignment is to create a Java program that prints to console different types of vehicles
Your program must follow the next rules:
• You need to implement a producer task which randomly generate vehicles – the Properties {Color, % remainPower, PoweredBy, number of doors, cargoAttached} of each vehicle are random.
• you can decide on each type of the properties.
• The producer task will run for 1 minute
• You need to implement consumer task which receive the vehicles created by the producer and print the all object`s properties
• The consumer must not wait for the producer to complete generating all the vehicles – it needs to start printing as soon as possible
• The vehiclesprint order on the console needs to be with the same order created by the producer task
• Consumer and producer should have single reader/writer



Vehicle types:
Electric Motocyle :
2 wheels
Color
% remainPower PoweredBy = Electricity
Motocyle :
2 wheels
Color
% remainPower PoweredBy = Gasoline
Car :
4 wheels
2-5 doors
Color
%remainPower PoweredBy = Gasoline
Electric Car :
4 wheels
2-5 doors
Color
% remainPower PoweredBy = Electricity
Truck :
18 wheels
Color
% remainPower PoweredBy = Diesel
cargoAttached
