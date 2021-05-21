"use strict";

use(["/libs/wcm/foundation/components/utils/AuthoringUtils.js"], function (AuthoringUtils) {

    var CONST={
        PROP_SYMBOL: "symbol",
        PROP_SUMMARY: "summary",
    }

    var NAME = {
        CURRENTPRICE: "Current Price",
        REQUESTDATE: "Request Date",
        REQUESTTIME: "Request Time",
        UPDOWN: "Up/Down",
        OPENPRICE: "Open Price",
        RANGEHIGH: "Range High",
        RANGEBELOW: "Range Low",
        VOLUME: "Volume",
    }

    var stockcomp = {};

    stockcomp.symbol = properties.get(CONST.PROP_SYMBOL,"");
    stockcomp.summary = properties.get(CONST.PROP_SUMMARY,"");

    //If no symbol or summary has been given, show a touch ui placeholder
    if(stockcomp.symbol == "" && stockcomp.summary == ""){
        if(AuthoringUtils.isTouch){
			//Set placeholder class for touch
            stockcomp.cssClass = "cq-placeholder";
        } else {
			//Set placeholder class for classic
            stockcomp.cssClass = "cq-text-placeholder-ipe";
        }
    }


    
	return stockcomp;
});