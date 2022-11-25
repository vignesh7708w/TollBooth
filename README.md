# TollBooth
Toll booth functionalities for vehicles passing through toll gates

- No cost will be taken at the entry gate
- Cost will be deducted at the exit gate depending on the travel distance

Input - You will get the vehicle type and entry point.

Output - Determine the charges based on the travel distance and vehicle type.

## Approach
- Vehicle - An entity to store information about vehicle such registrationNumber, ownerName & type
- TollEntity - An entity to store information about toll entries such as vehicle, entryTollPosition, exitTollPosition & distanceCovered. This also contains business logic to compute distance and cost
- Vehicle - An enum which contains information about vehicle types and cost per toll.
- TollManager - A driver class which contains business logic to store vehicle entry and exit. Also contains a map to store information tollEntity which we can later convert it into db
