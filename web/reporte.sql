select count(res.codCancha), can.codcancha, can.descripcion, can.tipoCesped, can.costoHora
from tb_cancha can inner join tb_reserva res on can.codCancha = res.codCancha
where TO_DATE(cr.fechaReserva,'DD/MM/YYYY')>=to_date('29/03/2010','DD/MM/YYYY')
group by can.codcancha, can.descripcion, can.tipoCesped
order by 1 desc