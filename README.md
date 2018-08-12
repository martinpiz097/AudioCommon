# AuCom (AudioCommunication)
Java library that provides tools for audio recording and playback.

0.9
	Funcionally version

0.9.1-1b 
	- The Speaker and Microphone class was modified by changing the form
	to instantiate objects.

	- The readAudio (int len) method was added in the Microphone class.

	- Modified the audio formats and added new formats to choose from, in the AudioQuality class

	- A new constructor was added to the AudioInterface class

	- The org.aucommon.io package was created with the classes ByteBuffer, ElectroOutputStream and ElectroInputStream for audio 
	management.

	- More audio tests were made.

	- It is desired to implement a voice compression method.
0.9.1-1 - Omission of experimental methods and classes

0.9.2	- Close and setGain methods in the Speaker class.
	- Close and getInputStream method added to Microphone class.
0.9.3 	- Seted open methods

0.9.4	- Added getControl method to Speaker and Microphone

0.9.5	- Added multithreading support
