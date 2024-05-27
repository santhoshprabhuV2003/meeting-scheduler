# Meeting Scheduler Application

Meeting Scheduler simplifies the process of booking and managing schedules for Labs and Seminar halls within a department. It provides users with the ability to book slots, check booked slots, and generate comprehensive schedules, enhancing the overall efficiency of schedule management.

## Features

- Booking Management: Users can book slots for Labs and Seminar halls by providing a booking name, day, and slot. The system ensures that bookings are efficiently managed and prevents double booking of slots.
- Slot Checking: Users can check booked slots for specific days or get an overview of all booked slots throughout the week.
- Schedule Generation: The application generates a visual schedule, displaying booked slots for each day of the week.

## Class Descriptions

- Meeting (Interface): Defines the core functionalities for checking booked slots, booking halls, and generating schedules.
- Schedule: Extends BookHall and implements schedule generation. It overrides the bookHall method to include the hall name in booking details.
- Hall (Abstract Class): Implements the Meeting interface and provides the core functionalities for checking booked slots across different days.
- BookHall (Abstract Class): Extends Hall and includes the functionality to book slots for specific days, preventing double booking.

![Meeting-Scheduler-Class-Diagram](https://github.com/santhoshprabhuV2003/meeting-scheduler/assets/138225962/55718818-869e-493c-a280-b8ca03e1dd54)

## Tech Stack

- Java: Core programming language used for developing the application.
- Object-Oriented Programming (OOP): Leveraged OOP concepts to structure the application efficiently.

## Getting Started

1. Clone or download the repository from GitHub.
2. Navigate to the project directory.
3. Compile the Java classes and run the Main class to start the application.

## Usage

Once the application is running, users can interact with the console application to book slots, check booked slots, and generate schedules.
