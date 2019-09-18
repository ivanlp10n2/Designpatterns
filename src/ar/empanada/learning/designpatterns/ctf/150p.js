
function piResponse() {
    piSetCookie('visitor_id12882', '525397055', 3650);
    piSetCookie('visitor_id12882-hash', '540cab8c44cc4cd5b379b0b589774eac7c854f0420e3c969d6654bf8454333fe8179728fe434ce6c971b3283c67a88a21b0b0467', 3650);

    if (document.location.protocol != "https:" || (document.location.protocol == "https:" && true)) {
        var analytics_link = document.location.protocol + "//" + "www2.infosecinstitute.com/analytics?";
        pi.tracker.visitor_id='525397055';

        pi.tracker.visitor_id_sign='540cab8c44cc4cd5b379b0b589774eac7c854f0420e3c969d6654bf8454333fe8179728fe434ce6c971b3283c67a88a21b0b0467';

        var variables = 'conly=true';
        for (property in pi.tracker) {
            variables += "&" + property + "=" + encodeURIComponent(pi.tracker[property]);
        }
        var headID = document.getElementsByTagName("head")[0];
        piScriptObj[piScriptNum] = document.createElement('script');
        piScriptObj[piScriptNum].type = 'text/javascript';
        piScriptObj[piScriptNum].src = analytics_link + variables;
        headID.appendChild(piScriptObj[piScriptNum]);
        piScriptObj[piScriptNum].onload = function() { return; }
    }
}
piResponse();




