import { useMemo } from "react";
import { MdDelete, MdDetails, MdEdit } from "react-icons/md";
import { ButtonGroup, Table, Button } from "reactstrap";

function Productos({ table }) {
  const columns = useMemo(() => table.columns, [table]);
  const data = useMemo(() => table.data, [table]);

  return (
    <Table>
      <thead>
        <tr>
          {columns.map((column) => (
            <th>{column}</th>
          ))}
        </tr>
      </thead>
      <tbody>
        {data.map((data) => (
          <tr>
            <th scope="row">{data.codigo}</th>
            <td>{data.nombre}</td>
            <td>{data.stock}</td>
            <td>{data.precioUnitario}</td>
            <td>
              <ButtonGroup size="sm">
                <Button id="productoDetail" outline onClick={data.acciones}>
                  <MdDetails />
                </Button>
                <Button id="productoEdit" outline>
                  <MdEdit />
                </Button>
                <Button id="productoDelete" outline>
                  <MdDelete />
                </Button>
              </ButtonGroup>
            </td>
          </tr>
        ))}
      </tbody>
    </Table>
  );
}

export default Productos;
