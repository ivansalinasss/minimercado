import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

function ProductoDetalle({producto, open, handleClose}) {
  
  const closeBtn = (
    <button className="close" onClick={handleClose} type="button">
      &times;
    </button>
  );

  return (
    <div>
      <Modal isOpen={open} toggle={handleClose}>
        <ModalHeader toggle={handleClose} close={closeBtn}>
          {producto.nombre}
        </ModalHeader>
        <ModalBody>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
          eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
          minim veniam, quis nostrud exercitation ullamco laboris nisi ut
          aliquip ex ea commodo consequat. Duis aute irure dolor in
          reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
          pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
          culpa qui officia deserunt mollit anim id est laborum.
        </ModalBody>
        <ModalFooter>
          <Button color="primary" onClick={handleClose}>
            Aceptar
          </Button>
        </ModalFooter>
      </Modal>
    </div>
  );
}

export default ProductoDetalle;