import { LikeComponent } from './like-component';

// Start off with a likecomponenet that has 10 likes and is already selected
let component = new LikeComponent(10, true);

// print the initial component fields
console.log(`likesCount: ${component.likesCount}, isSelected: ${component.isSelected}`);

// simulates click event
component.onClick();
console.log(`EVENT: LikeComponent clicked`);

// print the initial component fields
console.log(`likesCount: ${component.likesCount}, isSelected: ${component.isSelected}`);