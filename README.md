# Light controller with Adafruit server and Voice activation

This is one of my personal IoT projects.

## Goal
- Utilize Adafruit server to store and send data about the lights.
- Develop an Android application to send HTTP requests onto the server.
- Send signal to control the LEDs on *Microbit* boards via UART protocol.
- Send signal to control the LEDs on *Microbit* boards via voice command (with Google Assistant).

## Devices
- Mobile phone (I use my personal smartphone Samsung Galaxy Note 9).
<p align="center">
  <img src="/assets/galaxy.jpg" alt="Samsung Galaxy Note 9" width=200/>
</p>

- *micro:bit V1* boards.
<p align="center">
  <img src="/assets/microbit.jpg" alt="*micro:bit V1" width=200/>
</p>

- Connectors (OTG adapter, etc.)
<p align="center">
  <img src="/assets/adapter.jpg" alt="OTG cable" width=200/>
</p>

## Connection diagram (TODO)

## Online setup
- Adafruit server:
I created a dashboard to send and receive signals and a feed attached to the aforementioned dashboad. The feed will record all signals sent to it.
<p align="center">
  <img src="/assets/adafruit_setup.png" alt="Adafruit" width=300/>
</p>

- IFTTT for Google Assistant's command:
This allow Google Assistant to execute a pre-set command once it detects the specific phrase(s).
<p align="center">
  <img src="/assets/google_assistant.png" alt="IFTTT" width=300/>
</p>

## Results
<p align="center">
  <img src="/assets/176331572_252483693267840_5291860450287102402_n.jpg" alt="Google Assistant 1" height=300/>
  <img src="/assets/177669837_1028473607987041_7268593159389747423_n.jpg" alt="Google Assitant 2" height=300/>
  <img src="/assets/175528655_305034204346117_2562767816612890340_n.jpg" alt="Android application 1" height=300/>
  <img src="/assets/176325569_287960662883720_8402170644910236346_n.jpg" alt="Android application 2" height=300/>
</p>
