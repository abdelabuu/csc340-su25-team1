# Auto Connect – Requirements & Test Scenarios

## Actors
- **Dealership** (Provider)  
- **Driver** (Customer)

---

## Use Cases

### 1. Dealership: Create & Manage Profile  
1. D1 visits **register.html**, signs in for the first time, and fills out their dealership profile.  
2. D1 exits the site.  

### 2. Dealership: Add Car Listings  
1. D1 logs back in, navigates to their dashboard (future feature), and creates two new listings:  
   - Car S1 with attributes (make, model, year, price)  
   - Car S2 with attributes (make, model, year, price)  
2. D1 exits the site.

### 3. Driver: Create Profile  
1. Dr1 visits **register.html**, signs up as a new Driver, and completes their profile.  
2. Dr1 exits the site.

### 4. Driver: Browse & Buy a Car  
1. Dr2 registers (if new) or logs in, lands on **index.html**.  
2. Dr2 browses the car cards (S1, S2).  
3. Dr2 clicks **Buy Car** on S1 → purchase is recorded.  
4. Dr2 exits the site.

### 5. Driver: Leave a Review  
1. Dr2 logs in, clicks **My Cars** → sees purchased car S1.  
2. Dr2 goes to **review.html**, selects S1, and submits a positive review.  
3. Dr2 exits the site.

### 6. Driver: Modify Profile  
1. Dr1 logs in, visits **register.html**, and updates their profile info.  
2. Dr1 views **index.html** and sees existing cars and any reviews.  
3. Dr1 optionally buys another car or exits the site.

### 7. Dealership: Reply to Reviews & View Stats  
1. D1 logs in, goes to the (future) Reviews dashboard, reads Dr2’s review of S1, and posts a “Thank you!” reply.  
2. D1 checks their Customer Statistics page (future) to see how many bought, viewed, or reviewed S1 & S2.  
3. D1 modifies their dealership profile if needed, then exits.

---
