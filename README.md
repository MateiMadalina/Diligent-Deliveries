# Diligent-Deliveries

### Overview

This project simulates the daily routine of deliverers at Diligent Deliveries, a logistics company similar to GLS. Deliverers are assigned addresses each morning and attempt to deliver packages throughout the day. The company introduced a bonus policy to incentivize successful deliveries, rewarding deliverers who achieve the highest success rates with a bonus for the day.

### Functionality

- The application tracks deliverers' performance and determines bonus recipients based on successful deliveries.
- Each delivery has a random chance for success, with a minimum of 50%. Failed deliveries can be re-attempted up to five times, with time costs associated with each attempt.
- Three main entities are modeled:
  - Address: Includes zip code, street address, and customer's name.
  - Parcel: Represents a package with an ID and associated address. The `deliver` method determines successful delivery based on a predefined success rate.
  - Rider: Represents a deliverer with attributes such as ID, name, and re-attempt preferences.
- At the end of the day, each Rider submits a report containing the number of successful deliveries and remaining re-attempts.

### Implementation

- The project is implemented in Java.
- It models a single day of deliveries with three riders, each with different re-attempt strategies.
- The application determines and displays the winning riders eligible for the bonus based on successful deliveries.

**Note:** This project has been completed and serves as a simulation exercise for tracking deliverers' performance and determining bonus recipients at Diligent Deliveries.

### Demo
![Screenshot 2024-02-28 154224](https://github.com/MateiMadalina/Diligent-Deliveries/assets/116349352/a4ef0b53-98f8-4791-b296-efce3bb499cd)


