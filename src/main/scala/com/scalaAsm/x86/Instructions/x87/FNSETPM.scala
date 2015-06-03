package com.scalaAsm.x86
package Instructions
package x87

// Description: Set Protected Mode
// Category: general/control

trait FNSETPM extends InstructionDefinition {
  val mnemonic = "FNSETPM"
}

object FNSETPM extends ZeroOperands[FNSETPM] with FNSETPMImpl

trait FNSETPMImpl extends FNSETPM {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xDB /+ 4
      }
}
