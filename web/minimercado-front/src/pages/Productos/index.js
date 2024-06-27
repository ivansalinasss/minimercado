import { useEffect, useState } from "react";
import DataTable from "../../layouts/DataTable";
import { APIGet } from "../../services/CallApi";
import ProductoDetalle from "./ProductoDetalle";

function Productos() {
  const columns = ["codigo", "Nombre", "Stock", "Precio Unitario", "Acciones"];
  const [productos, setProductos] = useState([]);
  const [openModalDetalle, setOpenModalDetalle] = useState(false);

  const onClickDetalle = (codigoProducto) => {
    setOpenModalDetalle(true);
  };

  const loadProductos = () => {
    APIGet(
      "productos/listar",
      null,
      (response) => {
        const temp = response.data.map((producto, i) => ({
          codigo: i,
          nombre: producto.nombre,
          stock: producto.cantidad + " " + producto.unidadAbreviatura,
          precioUnitario: producto.precioUnitario,
          acciones: () => onClickDetalle(i),
        }));
        setProductos(temp);
      },
      (error) => {
        alert("Hubo un error al cargar productos");
      }
    );
  };

  useEffect(() => {
    loadProductos();
  }, []);

  return (
    <div className="container mt-5">
      <ProductoDetalle
        producto={{}}
        open={openModalDetalle}
        handleClose={() => {
          setOpenModalDetalle(false);
        }}
      />
      <DataTable table={{ columns, data: productos }} />
    </div>
  );
}

export default Productos;
