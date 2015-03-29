package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Resume from System Management Mode
// Category: general/branch

trait RSM extends InstructionDefinition {
  val mnemonic = "RSM"
}

object RSM extends RSM with RSMImpl

trait RSMImpl {
  self: RSM =>
  implicit object RSM_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0xAA)
    override def hasImplicitOperand = true
  }
}
