///!MATCH_ERROR: Cannot use unexported type

// Attempt to expose an unexported type defined in this file should fail
// because that type will not be available in the module spec.

class UnexportedType {

}

export class ExportedType {
    p?: UnexportedType
}
