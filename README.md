# Traffic-Simulation-on-4-Lane-Freeway

I took line-by-line the code from Jason Galbraith: particularly from this 7-part, publicly available, series on YouTube. I then changed simply changed around a few details to match my own interest for the problem that I was concerned about. 
Full credits to Jason: https://www.youtube.com/channel/UCOuk_JHNvndUP7o_ivoX79g



![](3%20mins%20in.png)


![]initial.png)

The code was written in Eclipse SDK for Java Developers. The main code is in 'Traffic', and the 'Vehicle' code is the parent code, whereby the children are just the different cars, SUV, Sports, etc..

Download these files as a zip, and run the program in Java, it should work fine!


&&&&&&&&&&&&&&&&&&&&&&&&
The code was written for my Modelling and Simulation Class as a major project. The question I sought to solve was whether the fastest cars driving on the passing lane, and the trucks driving on the slowest lane, was the proper structure. That, given a simplified system of reality, whereby we can enter a car that was traveling quickly, an SUV that was relatively slower, and a Semi-Truck that was the slowest, that they would organize themselves into this system. 

The length of the car had a sure bit too so it was important to keep the lengths of the respective cars accurate. 

After running the simulation, I find that if we calculate the traffic flow by: the number of cars that exist (exit from the field of view) from each lane divided by a fixed time, and let the system run for a long time on different variations. That ultimately the results are not clear. That sometimes the cars organize themselves into very clearly fast and slow lanes, and that at other times the system seems chaotic, yet at both instances the flow rate are quite similar. 

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
If we ought to make this a simulation more accurate I can suggest a few details if anyone would like to add:
-create a 2-lane on-ramp
-extent the horizontal distance of the track
-The cars of the same type sometimes get stuck togethor and ultimately form to appear as one moving vehicle, this is a BUG
-a flow rate calculator for each lane 
-a 'total amount of car' available for the system at each point
a 'total time' available for the system




