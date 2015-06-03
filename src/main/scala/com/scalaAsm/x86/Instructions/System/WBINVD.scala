package com.scalaAsm.x86
package Instructions
package System

// Description: Write Back and Invalidate Cache
// Category: general

trait WBINVD extends InstructionDefinition {
  val mnemonic = "WBINVD"
}

object WBINVD extends ZeroOperands[WBINVD] with WBINVDImpl

trait WBINVDImpl extends WBINVD {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x09)
      }
}
