package com.scalaAsm.x86
package Instructions
package x87

// Description: Decrement Stack-Top Pointer
// Category: general/control

trait FDECSTP extends InstructionDefinition {
  val mnemonic = "FDECSTP"
}

object FDECSTP extends ZeroOperands[FDECSTP] with FDECSTPImpl

trait FDECSTPImpl extends FDECSTP {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
      }
}
