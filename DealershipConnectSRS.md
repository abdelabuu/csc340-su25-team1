# Software Requirements Specification  
### For Dealership Connect  
**Version:** 0.1  
**Prepared by:** Abdel Abukhalaf and Jacob Echeverry 
**Date:** May 27, 2025  

## 1. Introduction

### 1.1 Document Purpose  
This SRS defines the requirements for Dealership Connect — a simple platform where providers (car sellers) can post listings and customers (buyers) can browse and view car details. This document is meant for the developers, instructor, and teammates to understand the project’s goals and scope.

### 1.2 Product Scope  
The product is a basic web-based platform that connects car sellers and potential buyers. It will allow providers to upload listings with car information and images, and customers to view those listings and get more details. The site will include a homepage, a details page, and an about page, with future plans for search features and persistent data.

### 1.3 Definitions, Acronyms and Abbreviations  
- **SRS** – Software Requirements Specification  
- **UI** – User Interface  
- **HTML/CSS/JS** – Languages used to build the site frontend  
- **Provider** – Car seller  
- **Customer** – Car buyer  

### 1.4 References  
N/A for now — this will be updated if we use any libraries, frameworks, or design guides.

### 1.5 Document Overview  
This document includes an overview of the product, its features, and both functional and non-functional requirements. Each team member’s use-cases are included in Section 3.

## 2. Product Overview

### 2.1 Product Functions  
Dealership Connect allows sellers to upload and manage car listings that include images, pricing, and basic car details. Customers can view listings and click for more information. In later stages, we plan to allow search or filter functionality.

### 2.2 Product Constraints  
- The website will be built using HTML, CSS, and Bootstrap only (no JavaScript or backend yet)
- Pages must remain simple and load quickly
- The site should work on all major browsers
- No user login or data persistence in version 1

### 2.3 User Characteristics  
Users are expected to be able to use a basic website with clickable links and readable text. No technical experience is required. Sellers (providers) will be adding content; customers will be browsing only.

### 2.4 Assumptions and Dependencies  
- We assume sellers have access to a computer or laptop to upload content
- Customers are browsing from a desktop or mobile browser
- Bootstrap must be available via CDN (internet connection required)
- Dependencies may be added later if JavaScript or backend support is introduced

## 3. Requirements

### 3.1 Functional Requirements - Abdel 

- The provider can upload a new car listing with details like title, image, price, and description.
- The provider can view their existing listings on the homepage.
- The provider can link each car to a details page for more info.
- The provider can update the information on the about page.
- The provider's listings must be styled using Bootstrap cards.

 ### 3.2 Functional Requirements - Jacob




 ### 3.3 Non-Functional Requirements

- The website must load in under 2 seconds on most devices.
- The layout should be clean, easy to navigate, and mobile-friendly.
- Bootstrap must be used consistently across all pages.
- All links (navigation and buttons) must work properly.

<!-- describe customer-side features  -->


