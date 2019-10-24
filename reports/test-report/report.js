$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("editarPrecio.feature");
formatter.feature({
  "line": 1,
  "name": "Prueba de edicion de un precio dentro de un convenio",
  "description": "",
  "id": "prueba-de-edicion-de-un-precio-dentro-de-un-convenio",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2301992179,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log in en el sistema a vender para editar un precio",
  "description": "",
  "id": "prueba-de-edicion-de-un-precio-dentro-de-un-convenio;log-in-en-el-sistema-a-vender-para-editar-un-precio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Selecciono el menu de convenios",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Selecciono el conveio que voy a editar",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Selecciono el plan de precios qeu voy a editar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Selecciono y edito el precio que deseo.",
  "keyword": "Then "
});
formatter.match({
  "location": "EditarPrecio.seleccionoElMenuDeConvenios()"
});
formatter.result({
  "duration": 300681138,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"j_username\"}\n  (Session info: chrome\u003d78.0.3904.70)\n  (Driver info: chromedriver\u003d78.0.3904.70 (edb9c9f3de0247fd912a77b7f6cae7447f6d3ad5-refs/branch-heads/3904@{#800}),platform\u003dMac OS X 10.15.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 19 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027Gabriels-MacBook-Pro.local\u0027, ip: \u00272800:bf0:16f:2fca:7dd7:a98b:8fd3:49f4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_192-ea\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:64407}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d78.0.3904.70 (edb9c9f3de0247fd912a77b7f6cae7447f6d3ad5-refs/branch-heads/3904@{#800}), userDataDir\u003d/var/folders/yw/zb8sft7903l7rwszm364f6t40000gn/T/.com.google.Chrome.tcJxQu}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d78.0.3904.70, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 83a6b8ff2a8ca5aba5de0fd56a17e14b\n*** Element info: {Using\u003did, value\u003dj_username}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\n\tat cucumber.EditarPrecio.seleccionoElMenuDeConvenios(EditarPrecio.java:39)\n\tat ✽.Then Selecciono el menu de convenios(editarPrecio.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "EditarPrecio.seleccionoElConveioQueVoyAEditar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditarPrecio.seleccionoElPlanDePreciosQeuVoyAEditar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditarPrecio.seleccionoYEditoElPrecioQueDeseo()"
});
formatter.result({
  "status": "skipped"
});
});