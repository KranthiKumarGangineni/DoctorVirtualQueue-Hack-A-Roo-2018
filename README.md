# DoctorVirtualQueue-Hack-A-Roo-2018
App Use: This JAVA Application works as a Online Virtual Queue to join a Queue which will book appointments to a Doctor.

Global URL is setup using ngrok at: http://1aadd00e.ngrok.io/TeamAlpha/doctorQueueHome

Desciption: When a User tries to Login, it will send a Verification code to the user to log him/her successfully into Application.
We used Oracle Database for storing all the data. On First time Login, User will start recieving alerts about his Queue requests.
He/She can Opt out from the alerts by sending message to a Number which is configured by us or he/she can opt-out from the application
UI.Wait time status is sent to the user every 4 minutes, using Cron Job Scheduler.

Used 'Twilio' which is a Cloud Communication Platform to send/Recieve SMS.
Used 'Oracle SQL Developer' to store/retrieve data.
Used JAVA (Spring Boot, MyBatis, Maven) to build this application.
Used 'ngrok' to make the application Global.
Used 'FourSquareAPI' to get the Doctor Locations.
