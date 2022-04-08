import React, { Component } from 'react'
import pic from '../images/image1.jpeg'
import pic1 from '../images/image2.jpeg'
import pic2 from '../images/image3.jpeg'
import pic3 from '../images/image4.jpeg'
import '../CSS/FavList.css'


export class FavList extends Component {
  render() {
    return (
       
      <div>FavList
          <div class="images">
    <ul>
        <li><img src={pic}  /></li>
        <li><img src={pic1}  /></li>
        <li><img src={pic2}  /></li>
        <li><img src={pic3}  /></li> 
    </ul>
    </div>
      </div>
    )
  }
}

export default FavList