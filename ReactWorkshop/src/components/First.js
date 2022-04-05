
class First extends React.Component {
  constructor (props){
    super(props);

  }

  render() {
     const data =[{"name":"hhg"},{"name":"hgfhhg"}];
    const listItems = data.map((d) => <li key={d.name}>{d.name}</li>;
    
    return (
      <div>
      {listItems}
      </div>
    );
  }
} 