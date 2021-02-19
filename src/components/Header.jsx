import React from "react";

function Header(props) {
let content = {
  English: {
    title: "Lorem",
    description:
      "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
  },
  Malayalam: {
    title: "ലോറെം ഇപ്സിയം",
    description:
      "പ്രിന്റ് ആൻഡ് ടൈപ്പുചെയ്യൽ വ്യവസായത്തിന്റെ ഡമ്മി കോഡാണ് ലോറെം ഇപ്സിയം . 1500-കൾ മുതൽ ലൊറെം ഇപ്സം വ്യവസായത്തിന്റെ സ്റ്റാൻഡേർഡ് ഡമ്മി പാഠമാണ്, അജ്ഞാതമായ ഒരു പ്രിന്റർ ഒരു തരം ഗാലക്സി എടുത്ത് ഒരു സ്പെസിഫിക്കേഷൻ ബുക്ക് ഉണ്ടാക്കാൻ അതിനെ അണിനിരത്തി"
  }
};

props.language === "Malayalam"
  ? (content = content.Malayalam)
  : (content = content.English);

  return (
    <header class="bg-primary py-5 mb-5">
      <div class="container h-100">
        <div class="row h-100 align-items-center">
          <div class="col-lg-12">
            <h1 class="display-4 text-white mt-5 mb-2">{content.title}</h1>
            <p class="lead mb-5 text-white-50">{content.description}</p>
          </div>
        </div>
      </div>
    </header>
  );
}

export default Header;