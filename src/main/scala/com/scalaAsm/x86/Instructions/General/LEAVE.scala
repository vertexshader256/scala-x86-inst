package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: High Level Procedure Exit
// Category: general/stack

trait LEAVE extends InstructionDefinition {
  val mnemonic = "LEAVE"
}

object LEAVE extends LEAVE with ZeroOperands[LEAVE] with LEAVEImpl

trait LEAVEImpl {
  self: LEAVE =>
  implicit object LEAVE_0 extends _0 {
    val opcode: OneOpcode = 0xC9
    override def hasImplicitOperand = true
  }
}
