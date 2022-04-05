
import React, { Component } from 'react'

export class RandomImages extends Component {
  render() {
      const images=[{
        imag:"../images/image1.jpeg",
        
      },
      {
        imag:"../images/image1.jpeg",
      },
    {   imag:"../images/image1.jpeg",
    },
    {
        imag:"../images/image1.jpeg",
    }
    ]
    return (
      <div class="RandomImages">
          <h1>RandomImages</h1>
          {
              images.map((e,i) =>
              <ListOfImages image={e.imag}
              key={i}
              />
              )
          }
          
          </div>
    )
  }
}

export default RandomImages
