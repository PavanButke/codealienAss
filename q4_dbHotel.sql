tables(type, id, name, description, menu, address)
hotel(name , address , description , id )
menus (menu_id, name, price ) 
hotels_menus (hotel_id, menu_id)

--Retrieve order
SELECT m.name,
 m.price 
 FROM hotel_menus
  AS hm 
 INNER JOIN menus 
 AS m
 ON hm.hotel_id = [hotel_id]
 AND hm.menu_id = m.menu_id