# Final-Project-API-Machrush

# Assignment-02-Machrush
This assignment is about test the data from RestAPI, with structure like this.

_ reqres.in<br/>
_____ /api<br/>
___________ /users<br/>
_________________ /{n in integer}<br/>
___________ /unknown<br/>
_________________ /{n in integer}<br/>
___________ /login<br/>
___________ /register<br/>

## RestAPI Route
### GET
This route is about getting data on API, but before the data shown, this route check all data.
### DELETE
This route is about delete data on API by ID, so this return null data, but before the null data shown, this route check all data.
### POST
This route is about posting data on API, so this return one data only, but before the data shown, this route check all data.
### PUT
This route like POST route, but specifically use an ID.
### PATCH
This route like POST or PUT route, but can handle null value.
