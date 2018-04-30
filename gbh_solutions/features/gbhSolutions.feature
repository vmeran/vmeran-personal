Feature: GBH Solutions Steps

	Scenario: GBH Main Page Menus Test
	
Given user enters GBH Solutions page
When user clicks on 'Inicio' menu
Then user should see 'Inicio' page
When user hovers over 'Servicios' menu and clicks on 'Asesoria de interfaz y experiencia de usuario'
Then user should see 'Servicios' page
When user clicks on 'Portafolio' menu
Then user should see 'Portafolio' page
When user clicks on 'Conocenos' menu
Then user should see 'Conocenos' page
When user clicks on 'Empleos' menu
Then user should see 'Empleos' page
When user clicks on 'Blog' menu
Then user should see 'Blog' page